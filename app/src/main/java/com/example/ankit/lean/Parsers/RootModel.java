import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public String email;
	public String privacy;
	public VersionModel _version;
	public int id;
	public String type;
	public String name;
	public String description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String code_of_conduct;

	public RootModel(CopyrightModel copyright, String schedule_published_on, String end_time, String topic, String organizer_description, String location_name, String organizer_name, String start_time, CreatorModel creator, String email, String privacy, VersionModel version, int id, String type, String name, String description, String logo, ArrayList<Social_linksModel> social_links, String timezone, String background_image, Call_for_papersModel call_for_papers, String state, String code_of_conduct) {

		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this.email = email;
		this.privacy = privacy;
		this._version = version;
		this.id = id;
		this.type = type;
		this.name = name;
		this.description = description;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.code_of_conduct = code_of_conduct;

	}

}
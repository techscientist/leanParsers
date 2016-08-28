import java.util.ArrayList;

class RootModel {

	public int id;
	public CopyrightModel _copyright;
	public String location_name;
	public VersionModel _version;
	public String privacy;
	public String start_time;
	public String type;
	public String name;
	public CreatorModel _creator;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_name;
	public String background_image;
	public String schedule_published_on;
	public String organizer_description;
	public String logo;
	public String topic;
	public String email;
	public String end_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;

	public RootModel(int id, CopyrightModel copyright, String location_name, VersionModel version, String privacy, String start_time, String type, String name, CreatorModel creator, String timezone, Call_for_papersModel call_for_papers, String state, String organizer_name, String background_image, String schedule_published_on, String organizer_description, String logo, String topic, String email, String end_time, String description, ArrayList<Social_linksModel> social_links, String code_of_conduct) {

		this.id = id;
		this._copyright = copyright;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.name = name;
		this._creator = creator;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.topic = topic;
		this.email = email;
		this.end_time = end_time;
		this.description = description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;

	}

}
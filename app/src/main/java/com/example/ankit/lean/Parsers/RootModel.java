import java.util.ArrayList;

class RootModel {

	public String topic;
	public String name;
	public String end_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String type;
	public String logo;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public String start_time;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String email;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;
	public String state;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;

	public RootModel(String topic, String name, String end_time, String organizer_description, Call_for_papersModel call_for_papers, String location_name, String type, String logo, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, int id, String start_time, CreatorModel creator, String schedule_published_on, String email, String privacy, CopyrightModel copyright, String description, String state, String timezone, String organizer_name, String code_of_conduct) {

		this.topic = topic;
		this.name = name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;
		this.state = state;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;

	}

}
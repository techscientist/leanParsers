import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String timezone;
	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public String description;
	public String logo;
	public String topic;
	public String start_time;
	public String type;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String name;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public RootModel(String privacy, String timezone, String end_time, VersionModel version, String organizer_description, String schedule_published_on, String location_name, String description, String logo, String topic, String start_time, String type, String background_image, String state, CopyrightModel copyright, String organizer_name, String name, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, String email, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this.privacy = privacy;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this.topic = topic;
		this.start_time = start_time;
		this.type = type;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.name = name;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}
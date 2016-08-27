import java.util.ArrayList;

class RootModel {

	public String logo;
	public CreatorModel _creator;
	public String topic;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String start_time;
	public String timezone;
	public String end_time;
	public String location_name;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public String schedule_published_on;
	public int id;
	public String type;
	public String state;
	public String code_of_conduct;

	public RootModel(String logo, CreatorModel creator, String topic, String name, Call_for_papersModel call_for_papers, String organizer_name, String start_time, String timezone, String end_time, String location_name, String email, ArrayList<Social_linksModel> social_links, String privacy, VersionModel version, String organizer_description, String background_image, CopyrightModel copyright, String description, String schedule_published_on, int id, String type, String state, String code_of_conduct) {

		this.logo = logo;
		this._creator = creator;
		this.topic = topic;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.end_time = end_time;
		this.location_name = location_name;
		this.email = email;
		this.social_links = social_links;
		this.privacy = privacy;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;

	}

}
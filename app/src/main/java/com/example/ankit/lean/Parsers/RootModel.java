import java.util.ArrayList;

class RootModel {

	public String email;
	public CreatorModel _creator;
	public String timezone;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String logo;
	public VersionModel _version;
	public String end_time;
	public CopyrightModel _copyright;
	public String background_image;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String topic;
	public String location_name;
	public String schedule_published_on;
	public String name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String privacy;

	public RootModel(String email, CreatorModel creator, String timezone, String code_of_conduct, String organizer_name, String state, String logo, VersionModel version, String end_time, CopyrightModel copyright, String background_image, int id, Call_for_papersModel call_for_papers, String type, String description, String topic, String location_name, String schedule_published_on, String name, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String privacy) {

		this.email = email;
		this._creator = creator;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.logo = logo;
		this._version = version;
		this.end_time = end_time;
		this._copyright = copyright;
		this.background_image = background_image;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.topic = topic;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.privacy = privacy;

	}

}
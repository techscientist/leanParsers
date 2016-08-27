import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String email;
	public String background_image;
	public String topic;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String type;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String logo;
	public String timezone;
	public int id;
	public String privacy;
	public String state;

	public RootModel(String end_time, String email, String background_image, String topic, String organizer_description, String start_time, CreatorModel creator, String code_of_conduct, String name, VersionModel version, String schedule_published_on, String type, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String description, String organizer_name, CopyrightModel copyright, String logo, String timezone, int id, String privacy, String state) {

		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.description = description;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.logo = logo;
		this.timezone = timezone;
		this.id = id;
		this.privacy = privacy;
		this.state = state;

	}

}